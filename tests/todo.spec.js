const assert = require('assert');
const TodoPage = require('../pages/todo.page');

describe('Todo suite', () => {
  it.skip('should enter values using setValue', () => {
    let val = 'Hello';

    browser.url('');

    TodoPage.todoField.setValue(val);
    assert.equal(TodoPage.todoField.getValue(), val, 'The value is not the same');

    browser.pause(3000);
  });

  it.skip('should enter values using keys', () => {
    let val = 'Hello';

    browser.url('');

    // TodoPage.todoField.setValue(val);
    // TodoPage.todoField.click();
    browser.keys(val);

    // browser.keys('H');
    // browser.keys('i');

    assert.equal(TodoPage.todoField.getValue(), val, 'The value is not the same');

    browser.pause(3000);

    browser.keys(['Control', 'a']);
    browser.pause(3000);
    browser.keys(['Control', 'x']);
    browser.pause(3000);
    browser.keys(['Control', 'v']);

    // browser.keys('Enter');
    // browser.keys('\uE007');

    browser.pause(3000);
  });

  it.skip('should enter value and then delete it', () => {
    let val = 'Hello';

    browser.url('');

    TodoPage.todoField.setValue(val);
    assert.equal(TodoPage.todoField.getValue(), val, 'The value is not the same');

    browser.pause(3000);

    browser.keys('Enter');

    browser.pause(3000);

    TodoPage.todoItem1.moveTo();

    browser.pause(3000);

    TodoPage.deleteItem1.click();

    browser.pause(3000);
  });

  it('should enter value and then edit it', () => {
    let val = 'Hello';

    browser.url('');

    TodoPage.todoField.setValue(val);
    assert.equal(TodoPage.todoField.getValue(), val, 'The value is not the same');

    browser.pause(3000);

    browser.keys('Enter');

    browser.pause(3000);

    TodoPage.todoItem1.doubleClick();

    browser.pause(3000);

    browser.keys(['Control', 'a']);
    browser.pause(3000);
    browser.keys('Delete');
    browser.pause(3000);
    browser.keys('Bye');
    browser.pause(3000);

    browser.keys('Enter');

    browser.pause(3000);
  });
});
