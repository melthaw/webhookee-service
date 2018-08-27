/* tslint:disable:no-unused-variable */

import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { AppTopBarComponent } from './app.topbar.component';
import { AppFooterComponent } from './app.footer.component';
import { AppSideBarComponent } from './app.sidebar.component';
import { AppSideBarTabContentComponent } from './app.sidebartabcontent.component';
import { AppMenuComponent, AppSubMenuComponent } from './app.menu.component';
import {ScrollPanel} from 'primeng/primeng';

describe('AppComponent', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
        imports: [ RouterTestingModule ],
        declarations: [ AppComponent,
                AppTopBarComponent,
                AppMenuComponent,
                AppSubMenuComponent,
                AppFooterComponent,
                AppSideBarComponent,
                AppSideBarTabContentComponent,
            ScrollPanel
            ]
    });
    TestBed.compileComponents();
  });

  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
});
