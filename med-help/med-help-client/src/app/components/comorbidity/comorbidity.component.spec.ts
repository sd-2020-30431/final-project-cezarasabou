import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComorbidityComponent } from './comorbidity.component';

describe('ComorbidityComponent', () => {
  let component: ComorbidityComponent;
  let fixture: ComponentFixture<ComorbidityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComorbidityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComorbidityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
