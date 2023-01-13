import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WebsiteLogoComponent } from './website-logo.component';

describe('WebsiteLogoComponent', () => {
  let component: WebsiteLogoComponent;
  let fixture: ComponentFixture<WebsiteLogoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WebsiteLogoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WebsiteLogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
