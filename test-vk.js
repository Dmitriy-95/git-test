module.exports = {
  tags: ['vk'],
  'Demo test vk' : function (client) {
    client
      .url('https://vk.com/')
      .pause(1000)
      .waitForElementVisible('body', 2000)
      .click('.top_home_link')
      .pause(1000)
      .waitForElementVisible('body', 1000)
      .click('#index_email')
      .setValue('#index_email', 'test')
      .click('#index_pass')
      .setValue('#index_pass', 'test')
      .click('#index_expire')
      .click('#index_login_button')
      .pause(3000)
      .waitForElementVisible('body', 2000)
      .click('.top_home_link')
      .pause(5000)




      .end();
  }
};