import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaColegioComponent } from './consulta-colegio.component';

describe('ConsultaColegioComponent', () => {
  let component: ConsultaColegioComponent;
  let fixture: ComponentFixture<ConsultaColegioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaColegioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaColegioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
