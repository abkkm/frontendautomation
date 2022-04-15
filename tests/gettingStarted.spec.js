describe('Getting Started', () => {
  it.skip('should open a web page', () => {
    // browser.url('https://the-internet.herokuapp.com/');

    // Correct Base URL set in the config
    // baseURL + relative URL
    // https://the-internet.herokuapp.com + 'abtest'
    // https://the-internet.herokuapp.com/abtest
    // browser.url('abtest');

    // 'https://the-internet.herokuapp.com/jqueryui/menu'
    browser.url('/jqueryui');

    console.log(browser.getUrl());

    browser.pause(5000);
  });

  it.skip('should click something', () => {
    browser.url('/');
    // #content > ul > li:nth-child(1) > a
    // document.querySelector("#content > ul > li:nth-child(1) > a")
    // $("#content > ul > li:nth-child(1) > a")

    var abTestLink = $('#content > ul > li:nth-child(1) > a');
    var h2Text = $('#content > h2');
    var h1Text = $('#content > h1');

    console.log('Link Text: ' + abTestLink.getText());
    console.log('H2 Text: ' + h2Text.getText());
    console.log('H1 Text: ' + h1Text.getText());

    // abTestLink.click();

    browser.pause(3000);
  });

  it.skip('should test check boxes', () => {
    browser.url('/');

    var checkboxLink = $('#content > ul > li:nth-child(6) > a');

    checkboxLink.click();

    var checkbox1 = $('#checkboxes > input[type=checkbox]:nth-child(1)');
    var checkbox2 = $('#checkboxes > input[type=checkbox]:nth-child(3)');

    console.log('Chk1 before: ' + checkbox1.getAttribute('checked'));
    console.log('Chk2 before: ' + checkbox2.getAttribute('checked'));

    checkbox1.click();
    checkbox2.click();

    console.log('Chk1 after: ' + checkbox1.getAttribute('checked'));
    console.log('Chk2 after: ' + checkbox2.getAttribute('checked'));

    browser.pause(3000);
  });

  it('should test text field', () => {
    browser.url('/');

    var inputLink = $('#content > ul > li:nth-child(27) > a');

    inputLink.click();

    var inputField = $('#content > div > div > div > input[type=number]');

    inputField.setValue('1');

    browser.pause(3000);

    console.log('Input Value: ' + inputField.getValue());
    // console.log('Get Text: ' + inputField.getText());

    inputField.setValue('123');

    browser.pause(3000);

    inputField.addValue('456');

    browser.pause(3000);

    inputField.clearValue();

    browser.pause(3000);
  });
});
