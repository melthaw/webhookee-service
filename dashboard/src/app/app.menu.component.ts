import {Component, Input, OnInit, EventEmitter, ViewChild} from '@angular/core';
import {trigger, state, style, transition, animate} from '@angular/animations';
import {Location} from '@angular/common';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/primeng';
import {AppComponent} from './app.component';

@Component({
    selector: 'app-menu',
    template: `
        <ul app-submenu [item]="model" root="true" class="navigation-menu" visible="true"></ul>
    `
})
export class AppMenuComponent implements OnInit {

    model: any[];

    constructor(public app: AppComponent) {}

    ngOnInit() {
        this.model = [
            {label: 'Dashboard', icon: 'fa fa-fw fa-home', routerLink: ['/']},
            {
                label: 'Menu Modes', icon: 'fa fa-fw fa-bars',
                items: [
                    {label: 'Static Menu', icon: 'fa fa-fw fa-bars',  command: () => this.app.changeToStaticMenu()},
                    {label: 'Overlay Menu', icon: 'fa fa-fw fa-bars',  command: () => this.app.changeToOverlayMenu()}
                ]
            },
            {
                label: 'Themes', icon: 'fa fa-fw fa-paint-brush', badge: '5',
                items: [
                    {label: 'Green', icon: 'fa fa-fw fa-paint-brush', command: (event) => {this.changeTheme('green'); }},
                    {label: 'Blue', icon: 'fa fa-fw fa-paint-brush', command: (event) => {this.changeTheme('blue'); }},
                    {label: 'Orange', icon: 'fa fa-fw fa-paint-brush', command: (event) => {this.changeTheme('orange'); }}
                ]
            },
            {
                label: 'Components', icon: 'fa fa-fw fa-sitemap', badge: '10', badgeStyleClass: 'orange-badge',
                items: [
                    {label: 'Sample Page', icon: 'fa fa-fw fa-columns', routerLink: ['/sample']},
                    {label: 'Forms', icon: 'fa fa-fw fa-code', routerLink: ['/forms']},
                    {label: 'Data', icon: 'fa fa-fw fa-table', routerLink: ['/data']},
                    {label: 'Panels', icon: 'fa fa-fw fa-list-alt', routerLink: ['/panels']},
                    {label: 'Overlays', icon: 'fa fa-fw fa-square', routerLink: ['/overlays']},
                    {label: 'Menus', icon: 'fa fa-fw fa-minus-square-o', routerLink: ['/menus']},
                    {label: 'Messages', icon: 'fa fa-fw fa-circle-o-notch', routerLink: ['/messages']},
                    {label: 'Charts', icon: 'fa fa-fw fa-area-chart', routerLink: ['/charts']},
                    {label: 'File', icon: 'fa fa-fw fa-arrow-circle-o-up', routerLink: ['/file']},
                    {label: 'Misc', icon: 'fa fa-fw fa-user-secret', routerLink: ['/misc']}
                ]
            },
            {label: 'Landing Page', icon: 'fa fa-fw fa-certificate', url: 'assets/pages/landing.html', target: '_blank'},
            {
                label: 'Template Pages', icon: 'fa fa-fw fa-life-saver',
                items: [
                    {label: 'Empty Page', icon: 'fa fa-fw fa-square-o', routerLink: ['/empty']},
                    {label: 'Login Page', icon: 'fa fa-fw fa-sign-in', url: 'assets/pages/login.html', target: '_blank'},
                    {label: 'Error Page', icon: 'fa fa-fw fa-exclamation-circle', url: 'assets/pages/error.html', target: '_blank'},
                    {label: '404 Page', icon: 'fa fa-fw fa-times', url: 'assets/pages/404.html', target: '_blank'},
                    {label: 'Access Denied Page', icon: 'fa fa-fw fa-exclamation-triangle',
                      url: 'assets/pages/access.html', target: '_blank'}
                ]
            },
            {
                label: 'Menu Hierarchy', icon: 'fa fa-fw fa-gg',
                items: [
                    {
                        label: 'Submenu 1', icon: 'fa fa-fw fa-sign-in',
                        items: [
                            {
                                label: 'Submenu 1.1', icon: 'fa fa-fw fa-sign-in',
                                items: [
                                    {label: 'Submenu 1.1.1', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 1.1.2', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 1.1.3', icon: 'fa fa-fw fa-sign-in'},
                                ]
                            },
                            {
                                label: 'Submenu 1.2', icon: 'fa fa-fw fa-sign-in',
                                items: [
                                    {label: 'Submenu 1.2.1', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 1.2.2', icon: 'fa fa-fw fa-sign-in'}
                                ]
                            },
                        ]
                    },
                    {
                        label: 'Submenu 2', icon: 'fa fa-fw fa-sign-in',
                        items: [
                            {
                                label: 'Submenu 2.1', icon: 'fa fa-fw fa-sign-in',
                                items: [
                                    {label: 'Submenu 2.1.1', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 2.1.2', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 2.1.3', icon: 'fa fa-fw fa-sign-in'},
                                ]
                            },
                            {
                                label: 'Submenu 2.2', icon: 'fa fa-fw fa-sign-in',
                                items: [
                                    {label: 'Submenu 2.2.1', icon: 'fa fa-fw fa-sign-in'},
                                    {label: 'Submenu 2.2.2', icon: 'fa fa-fw fa-sign-in'}
                                ]
                            },
                        ]
                    }
                ]
            },
            {label: 'Utils', icon: 'fa fa-fw fa-wrench', routerLink: ['/utils']},
            {label: 'Documentation', icon: 'fa fa-fw fa-book', routerLink: ['/documentation']}
        ];
    }

    changeTheme(theme) {
        this.app.theme = theme;
        const themeLink: HTMLLinkElement = <HTMLLinkElement> document.getElementById('theme-css');
        const layoutLink: HTMLLinkElement = <HTMLLinkElement> document.getElementById('layout-css');

        themeLink.href = 'assets/theme/theme-' + theme + '.css';
        layoutLink.href = 'assets/layout/css/layout-' + theme + '.css';

    }
}

@Component({
    /* tslint:disable:component-selector */
    selector: '[app-submenu]',
    /* tslint:enable:component-selector */
    template: `
        <ng-template ngFor let-child let-i="index" [ngForOf]="(root ? item : item.items)">
            <li [ngClass]="{'active-menuitem': isActive(i)}" [class]="child.badgeStyleClass" *ngIf="child.visible === false ? false : true">
                <a [href]="child.url||'#'" (click)="itemClick($event,child,i)" *ngIf="!child.routerLink"
                   [attr.tabindex]="!visible ? '-1' : null" [attr.target]="child.target"
                    (mouseenter)="hover=true" (mouseleave)="hover=false">
                    <i [ngClass]="child.icon"></i>
                    <span>{{child.label}}</span>
                    <span class="menuitem-badge" *ngIf="child.badge">{{child.badge}}</span>
                    <i class="fa fa-fw fa-angle-down" *ngIf="child.items"></i>
                </a>

                <a (click)="itemClick($event,child,i)" *ngIf="child.routerLink"
                    [routerLink]="child.routerLink" routerLinkActive="active-menuitem-routerlink"
                   [routerLinkActiveOptions]="{exact: true}" [attr.tabindex]="!visible ? '-1' : null" [attr.target]="child.target"
                    (mouseenter)="hover=true" (mouseleave)="hover=false">
                    <i [ngClass]="child.icon"></i>
                    <span>{{child.label}}</span>
                    <span class="menuitem-badge" *ngIf="child.badge">{{child.badge}}</span>
                    <i class="fa fa-fw fa-angle-down" *ngIf="child.items"></i>
                </a>
                <ul app-submenu [item]="child" *ngIf="child.items" [@children]="isActive(i) ?
                'visible' : 'hidden'" [visible]="isActive(i)"></ul>
            </li>
        </ng-template>
    `,
    animations: [
        trigger('children', [
            state('hidden', style({
                height: '0px'
            })),
            state('visible', style({
                height: '*'
            })),
            transition('visible => hidden', animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')),
            transition('hidden => visible', animate('400ms cubic-bezier(0.86, 0, 0.07, 1)'))
        ])
    ]
})
export class AppSubMenuComponent {

    @Input() item: MenuItem;

    @Input() root: boolean;

    @Input() visible: boolean;

    activeIndex: number;

    hover: boolean;

    constructor(public app: AppComponent, public router: Router, public location: Location) {}

    itemClick(event: Event, item: MenuItem, index: number) {
        // avoid processing disabled items
        if (item.disabled) {
            event.preventDefault();
            return true;
        }

        // activate current item and deactivate active sibling if any
        this.activeIndex = (this.activeIndex === index) ? null : index;

        // execute command
        if (item.command) {
            item.command({originalEvent: event, item: item});
        }

        // prevent hash change
        if (item.items || (!item.url && !item.routerLink)) {
            event.preventDefault();
        }

        // hide menu
        if (!item.items && (this.app.overlay || !this.app.isDesktop())) {
            this.app.sidebarActive = false;
        }
    }

    isActive(index: number): boolean {
        return this.activeIndex === index;
    }

    unsubscribe(item: any) {
        if (item.eventEmitter) {
            item.eventEmitter.unsubscribe();
        }

        if (item.items) {
            for (const childItem of item.items) {
                this.unsubscribe(childItem);
            }
        }
    }
}
