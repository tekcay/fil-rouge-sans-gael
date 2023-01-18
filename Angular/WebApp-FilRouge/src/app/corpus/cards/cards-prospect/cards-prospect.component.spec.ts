import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsProspectComponent } from './cards-prospect.component';

describe('CardsProspectComponent', () => {
  let component: CardsProspectComponent;
  let fixture: ComponentFixture<CardsProspectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsProspectComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsProspectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
