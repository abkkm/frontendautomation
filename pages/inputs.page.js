class InputsPage {
  get inputField() {
    return $('#content > div > div > div > input[type=number]');
  }
}

module.exports = new InputsPage();
