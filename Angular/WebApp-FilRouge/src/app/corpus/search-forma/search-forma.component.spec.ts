import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchFormaComponent } from './search-forma.component';

describe('SearchFormaComponent', () => {
  let component: SearchFormaComponent;
  let fixture: ComponentFixture<SearchFormaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchFormaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchFormaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
