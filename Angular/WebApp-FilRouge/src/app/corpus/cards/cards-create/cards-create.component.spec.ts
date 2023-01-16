import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsCreateComponent } from './cards-create.component';

describe('CardsCreateComponent', () => {
  let component: CardsCreateComponent;
  let fixture: ComponentFixture<CardsCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsCreateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
