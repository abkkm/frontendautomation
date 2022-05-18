browser
  .setViewPortSize({
    width: 1200,
    height: 800,
  })
  .url('/')
  .getTitle()
  .then(function (title) {
    console.log('Title is: ' + title);
  })
  .click('#contact-us')
  .pause(3000);
