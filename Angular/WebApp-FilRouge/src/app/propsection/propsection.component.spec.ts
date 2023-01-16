import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropsectionComponent } from './propsection.component';

describe('PropsectionComponent', () => {
  let component: PropsectionComponent;
  let fixture: ComponentFixture<PropsectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PropsectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PropsectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
