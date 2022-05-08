const assert = require('assert');
const TodoPage = require('../pages/todo.page');

describe('More Todo Suite', () => {
  it.skip('should create some todos', () => {
    browser.url('');

    // TodoPage.todoField.setValue('Buy food');
    // browser.keys('Enter');

    // TodoPage.todoField.setValue('Eat food');
    // browser.keys('Enter');

    // TodoPage.todoField.setValue('Wash dishes');
    // browser.keys('Enter');

    // TodoPage.createTodo('Buy food');
    // TodoPage.createTodo('Eat food');
    // TodoPage.createTodo('Wash dishes');

    for (let i = 0; i < 100; i++) {
      TodoPage.createTodo(`Item: ${i + 1}`);
    }

    browser.pause(3000);
  });

  it.skip('should create some todos', () => {
    browser.url('');

    let list = ['Item 1', 'Item 2', 'Item 3', 'Item 4'];

    for (let i = 0; i < list.length; i++) {
      TodoPage.createTodo(list[i]);
    }

    browser.pause(3000);
  });
});
