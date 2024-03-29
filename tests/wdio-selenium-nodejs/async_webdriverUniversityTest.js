describe('Verify whether webdriveruniversity links on homepage work correctly', function () {
  it('check that the contact us button opens the contact us page', function (done) {
    return browser
      .setViewportSize({
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
  });

  it('check that the login button opens the login portal page', function (done) {
    return browser
      .url('/')
      .click('#login-portal')
      .getTitle()
      .then(function (title) {
        console.log('Title is: ' + title);
      })
      .pause(3000);
  });
});
