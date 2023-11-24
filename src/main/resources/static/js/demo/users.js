// Call the dataTables jQuery plugin
$(document).ready(function () {
  loadUsers()
  $('#users').DataTable();
});

async function loadUsers() {

  const request = await fetch('/user', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
    /* body: JSON.stringify({ a: 1, b: 'Textual content' }) */
  });
  const users = await request.json();

  console.log(users);

  let userListHtml = '';

  for (const u of users) {
    let user = `
      <tr>
          <td>${u['id']}</td>
          <td>${u['name']} ${u['lastname']}</td>
          <td>${u['email']}</td>
          <td>${u['phone']}</td>
          <td>
          <a href="#" class="btn btn-danger btn-circle btn-sm">
                  <i class="fas fa-trash"></i>
              </a>
          </td>
      </tr>`;

    userListHtml += user;
  }



  document.querySelector("#users tbody").outerHTML = userListHtml;

}