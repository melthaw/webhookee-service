import { browser, element, by } from 'protractor';

export class MorpheusPage {
  navigateTo() {
    return browser.get('/');
  }
}
