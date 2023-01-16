import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsParamComponent } from './cards-param.component';

describe('CardsParamComponent', () => {
  let component: CardsParamComponent;
  let fixture: ComponentFixture<CardsParamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsParamComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsParamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
