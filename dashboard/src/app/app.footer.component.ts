import {Component} from '@angular/core';

@Component({
    selector: 'app-footer',
    template: `
        <div class="footer clearfix">
        <span>Copyright Morpheus, 2017</span>
        <div class="footer-links">
            <a href="#" class="first">Terms</a>
            <span class="link-divider">|</span>
            <a href="#">About</a>
            <span class="link-divider">|</span>
            <a href="#">Privacy</a>
            <span class="link-divider">|</span>
            <a href="#">Contact</a>
            <span class="link-divider">|</span>
            <a href="#">Map</a>
        </div>
    </div>
    `
})
export class AppFooterComponent {

}
