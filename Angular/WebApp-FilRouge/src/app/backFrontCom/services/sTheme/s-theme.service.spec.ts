import { TestBed } from '@angular/core/testing';

import { SThemeService } from './s-theme.service';

describe('SThemeService', () => {
  let service: SThemeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SThemeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
