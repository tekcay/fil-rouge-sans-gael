import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsSearchComponent } from './cards-search.component';

describe('CardsSearchComponent', () => {
  let component: CardsSearchComponent;
  let fixture: ComponentFixture<CardsSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsSearchComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
