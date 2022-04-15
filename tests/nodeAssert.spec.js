const InternetPage = require('../pages/internet.page');
const assert = require('assert');
const InputsPage = require('../pages/inputs.page');
describe('Node Assesion Tests', () => {
  it.skip('should display correct text for the heading', () => {
    browser.url('/');
    assert.equal(InternetPage.mainHeadingText.getText(), 'Welcome to the-internet!', "The heading text doesn't match");
  });
  it('should navigate to new page and enter some text', () => {
    browser.url('/');
    InternetPage.inputsLink.click();
    assert.equal(browser.getUrl(), 'https://the-internet.herokuapp.com/inputs', 'The URLs are not the same');

    //Check if initial value is empty
    assert.equal(InputsPage.inputField.getValue(), '', 'The value is not null');

    InputsPage.inputField.setValue('10');

    //Check if new value is something
    assert.equal(InputsPage.inputField.getValue(), '10', 'The values are same');
  });
});
