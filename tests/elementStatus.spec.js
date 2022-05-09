const assert = require('assert');
const ElementStatusPage = require('../pages/elementStatus.page');

beforeEach(() => {
  browser.url('');
});

afterEach(() => {
  browser.pause(3000);
});

describe('Element Status Suite', () => {
  it.skip('should not display hidden text', () => {
    ElementStatusPage.displayElementButton.click();

    // ms, reverse, error
    ElementStatusPage.hiddenText.waitForDisplayed(1000, true);

    assert.equal(ElementStatusPage.hiddenText.isDisplayed(), false, 'Element is displayed');
  });

  it.skip('should display hidden text', () => {
    ElementStatusPage.displayElementButton.click();

    // ms, reverse, error
    ElementStatusPage.hiddenText.waitForDisplayed(3000);

    assert.equal(ElementStatusPage.hiddenText.isDisplayed(), true, 'Element is not displayed');
  });

  it.skip('should display existing text', () => {
    ElementStatusPage.createButton.click();

    ElementStatusPage.newText.waitForExist(3000);

    assert.equal(ElementStatusPage.newText.isExisting(), true, 'Element does not exist');
  });

  it.skip('should not display existing text', () => {
    ElementStatusPage.createButton.click();

    ElementStatusPage.newText.waitForExist(1000, true);

    assert.equal(ElementStatusPage.newText.isExisting(), false, 'Element does not exist');
  });

  it.skip('should be clickable', () => {
    ElementStatusPage.clickMeButton.click();

    ElementStatusPage.clickMeTooButton.waitForClickable({ timeout: 3000 });

    assert.equal(ElementStatusPage.clickMeTooButton.isClickable(), true, 'Button is not clickable');

    ElementStatusPage.clickMeTooButton.click();

    assert.equal(ElementStatusPage.clickableText.isDisplayed(), true, 'Text is not displayed');
    assert.equal(ElementStatusPage.clickableText.getText(), 'Button 2 clicked', 'Clickable text is not the same');
  });

  it.skip('should be not clickable', () => {
    ElementStatusPage.clickMeButton.click();

    ElementStatusPage.clickMeTooButton.waitForClickable({ timeout: 1000, reverse: true });

    assert.equal(ElementStatusPage.clickMeTooButton.isClickable(), false, 'Button is clickable');

    ElementStatusPage.clickMeTooButton.click();

    assert.equal(ElementStatusPage.clickableText.isDisplayed(), false, 'Text is not displayed');
  });

  it.skip('should be enabled', () => {
    ElementStatusPage.enableButton.click();

    ElementStatusPage.inputField.waitForEnabled(3000);

    assert.equal(ElementStatusPage.inputField.isEnabled(), true, 'Input is disabled');

    ElementStatusPage.inputField.setValue('Enabled');
  });

  it.skip('should not be enabled', () => {
    ElementStatusPage.enableButton.click();

    ElementStatusPage.inputField.waitForEnabled(1000, true);

    assert.equal(ElementStatusPage.inputField.isEnabled(), false, 'Input is enable');
  });

  it.skip('should change text', () => {
    ElementStatusPage.changeButton.click();

    browser.waitUntil(() => {
      return ElementStatusPage.changeText.getText() == 'New Text';
    }, 3000);

    assert.equal(ElementStatusPage.changeText.getText(), 'New Text', 'Text is not the same');
  });

  it('should display text using waitUntil', () => {
    ElementStatusPage.displayElementButton.click();

    browser.waitUntil(() => {
      return ElementStatusPage.hiddenText.isDisplayed() === true;
    }, 3000);

    ElementStatusPage.hiddenText.isDisplayed();
  });
});
