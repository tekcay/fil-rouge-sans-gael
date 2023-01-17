import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsTabBordComponent } from './cards-tab-bord.component';

describe('CardsTabBordComponent', () => {
  let component: CardsTabBordComponent;
  let fixture: ComponentFixture<CardsTabBordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsTabBordComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsTabBordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
