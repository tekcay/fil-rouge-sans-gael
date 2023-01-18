import { TestBed } from '@angular/core/testing';

import { SsThemeService } from './ss-theme.service';

describe('SsThemeService', () => {
  let service: SsThemeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SsThemeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
