const assert = require('assert');
const TodoPage = require('../pages/todo.page');

describe('Dynamic selector suite', () => {
  it('should get text for multiple items', () => {
    browser.url('');

    TodoPage.createTodo('First');
    TodoPage.createTodo('Second');

    assert.equal(
      TodoPage.todoItemByRow(1).getText(),
      'First',
      `Text is actually: ${TodoPage.todoItemByRow(1).getText()}`
    );

    assert.equal(
      TodoPage.todoItemByRow(2).getText(),
      'Second',
      `Text is actually: ${TodoPage.todoItemByRow(2).getText()}`
    );

    TodoPage.todoItemByRow(1).moveTo();

    TodoPage.deleteItemButtonByRow(1).click();

    TodoPage.todoItemByRow(1).moveTo();

    TodoPage.deleteItemButtonByRow(1).click();
  });

  it('should get text using querySelectorAll', () => {
    browser.url('');

    TodoPage.createTodo('First');
    TodoPage.createTodo('Second');

    assert.equal(TodoPage.todoItems[0].getText(), 'First', `Text is actually: ${TodoPage.todoItems[0].getText()}`);

    assert.equal(TodoPage.todoItems[1].getText(), 'Second', `Text is actually: ${TodoPage.todoItems[1].getText()}`);

    TodoPage.todoItemByRow(1).moveTo();

    TodoPage.deleteItems[0].click();

    TodoPage.todoItemByRow(1).moveTo();

    TodoPage.deleteItems[0].click();
  });

  it('should get text using querySelectorAll', () => {
    browser.url('');

    const list = ['First', 'Second', 'Third', 'Fourth'];

    for (let i = 0; i < list.length; i++) {
      TodoPage.createTodo(list[i]);
    }

    for (let i = 4; i > 0; i--) {
      TodoPage.todoItemByRow(i).moveTo();

      TodoPage.deleteItems[i - 1].click();
    }
  });

  it('should get text using method selector', () => {
    browser.url('');

    const list = ['First', 'Second', 'Third', 'Fourth'];

    for (let i = 0; i < list.length; i++) {
      TodoPage.createTodo(list[i]);
    }

    for (let i = 4; i > 0; i--) {
      TodoPage.todoItemByRow(i).moveTo();

      TodoPage.deleteItemButtonByRow(i).click();
    }
  });

  it('should get text using a loop', () => {
    browser.url('');

    const list = ['First', 'Second', 'Third', 'Fourth'];

    for (let i = 0; i < list.length; i++) {
      TodoPage.createTodo(list[i]);
    }

    // for (let i = 0; i < list.length; i++) {
    //   assert.equal(TodoPage.todoItemByRow(i + 1).getText(), list[i], `The text for ${list[i]} is not the same`);
    // }

    for (let i = 0; i < list.length; i++) {
      assert.equal(TodoPage.todoItems[i].getText(), list[i], `The text for ${list[i]} is not the same`);
    }
  });
});
