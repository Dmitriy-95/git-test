module.exports = {
  tags: ['vk'],
  'Demo test vk' : function (client) {
    client
      .url('https://vk.com/')
      .pause(1000)
      .waitForElementVisible('body', 1000)
      .waitForElementVisible('#index_email', 1000)
      .setValue('#index_email', 'test')
      .waitForElementVisible('#index_pass', 5000)
      .click('#index_pass')
      .setValue('#index_pass', 'test')
      .click('#index_login_button')
      .pause(5000)
      .end();
  }
};