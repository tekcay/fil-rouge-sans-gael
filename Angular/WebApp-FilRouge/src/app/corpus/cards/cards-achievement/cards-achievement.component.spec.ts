import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardsAchievementComponent } from './cards-achievement.component';

describe('CardsAchievementComponent', () => {
  let component: CardsAchievementComponent;
  let fixture: ComponentFixture<CardsAchievementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardsAchievementComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardsAchievementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
