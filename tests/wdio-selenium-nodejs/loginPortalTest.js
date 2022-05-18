browser
  .setViewPortSize({
    width: 1200,
    height: 800,
  })
  .url('/')
  .click('#login-portal')
  .getTitle()
  .then(function (title) {
    console.log('Title is: ' + title);
  });
