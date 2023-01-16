import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateFormaComponent } from './create-forma.component';

describe('CreateFormaComponent', () => {
  let component: CreateFormaComponent;
  let fixture: ComponentFixture<CreateFormaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateFormaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateFormaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
