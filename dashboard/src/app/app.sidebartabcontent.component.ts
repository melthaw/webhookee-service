import {Component, AfterViewInit, ViewChild } from '@angular/core';
import {ScrollPanel} from 'primeng/primeng';

declare var jQuery: any;

@Component({
    /* tslint:disable:component-selector */
    selector: 'app-sidebarTabContent',
    /* tslint:enable:component-selector */
    template: `
        <div class="layout-submenu-content" (click)="onClick($event)">
            <p-scrollPanel #scroller [style]="{height: '100%'}">
                <div class="menu-scroll-content">
                    <ng-content></ng-content>
                </div>
            </p-scrollPanel>
        </div>
    `
})
export class AppSideBarTabContentComponent implements AfterViewInit {

    @ViewChild('scroller') layoutMenuScrollerViewChild: ScrollPanel;

    ngAfterViewInit() {
        setTimeout(() => {this.layoutMenuScrollerViewChild.moveBar(); }, 100);
    }

    onClick(event: Event) {
        setTimeout(() => {
            this.layoutMenuScrollerViewChild.moveBar();
        }, 450);
    }
}
