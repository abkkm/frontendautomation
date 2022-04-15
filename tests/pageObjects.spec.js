const InternetPage = require('../pages/internet.page');

describe('Page Object Tests', () => {
  it('should use a page object', () => {
    browser.url('/');
    console.log('Main Heading: ' + InternetPage.mainHeadingText.getText());
    console.log('Sub Heading: ' + InternetPage.subHeadingText.getText());
  });
});
