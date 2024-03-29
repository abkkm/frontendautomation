class TodoPage {
  get todoField() {
    return $('body > section > div > header > input');
  }

  get todoItem1() {
    return $('body > section > div > section > ul > li > div > label');
  }

  // body > section > div > section > ul > li:nth-child(1) > div > label
  // body > section > div > section > ul > li:nth-child(2) > div > label

  // Row number starts at 1
  /**
   *
   * @param number row.
   * Rows start at 1.
   */
  todoItemByRow(row) {
    return $(`body > section > div > section > ul > li:nth-child(${row}) > div > label`);
  }

  get todoItems() {
    return $$('body > section > div > section > ul > li > div > label');
  }

  get deleteItem1() {
    return $('body > section > div > section > ul > li > div > button');
  }

  // body > section > div > section > ul > li:nth-child(1) > div > button

  deleteItemButtonByRow(row) {
    return $(`body > section > div > section > ul > li:nth-child(${row}) > div > button`);
  }

  get deleteItems() {
    return $$('body > section > div > section > ul > li > div > button');
  }

  createTodo(val) {
    this.todoField.setValue(val);
    browser.keys('Enter');
  }
}

module.exports = new TodoPage();
