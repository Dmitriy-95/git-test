module.exports = {
  tags: ['vk'],
  'Demo test vk' : function (client) {
    client
      .url('https://vk.com/')  // переход на сайт vk.com
      .pause(1000)      // пауза 1 секунда
      .waitForElementVisible('body', 2000) // ожидание появления элемента body в течении 2 секунд
      .click('.top_home_link')      // клик по логотипу vk 
      .pause(1000)                  // ожидание 1 секунду перезагрузки страницы
      .waitForElementVisible('body', 1000)  // ожидание появления элемента body в течении 1 секунд 
      .click('#index_email')      // клик по текстовому полю ввода email
      .setValue('#index_email', 'test')   // ввод тестового email
      .click('#index_pass')         // клик по полю ввода пороля
      .setValue('#index_pass', 'test')    // ввод тестового пороля
      .click('#index_expire')       // клик по чекбоксу "чужой компьютер"
      .click('#index_login_button')   // клик по кнпке "вход"
      .pause(3000)                // ожидание загрузки страницы с ошибкой 3 секунды
      .waitForElementVisible('body', 2000) // возврат на начальную страницу
      .click('.top_home_link')
      .pause(5000)




      .end();
  }
};