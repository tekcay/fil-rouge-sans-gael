import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFormaComponent } from './list-forma.component';

describe('ListFormaComponent', () => {
  let component: ListFormaComponent;
  let fixture: ComponentFixture<ListFormaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListFormaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListFormaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
