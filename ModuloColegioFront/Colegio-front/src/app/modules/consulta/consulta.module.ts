// --------- Modules --------- //
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

// --------- Material ---------//
import { MatDividerModule } from '@angular/material/divider';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

import {MatTooltipModule} from '@angular/material/tooltip';

// --------- Routing --------- //
import { ConsultaRoutingModule } from './consulta.routing';

// --------- Components ---------//
import { ConsultaColegioComponent } from '../../components/consulta-colegio/consulta-colegio.component';
import { TablaComponent } from '../../components/consulta-colegio/tabla/tabla.component';

@NgModule({
  declarations: [ConsultaColegioComponent, TablaComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ConsultaRoutingModule,
    /* -Material- */
    MatDividerModule,
    MatDialogModule,
    MatIconModule,
    MatTableModule,
    MatCardModule,
    MatFormFieldModule,
    MatToolbarModule,
    MatSelectModule,
    MatButtonModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatProgressSpinnerModule,
    MatTooltipModule,
  ]
})
export class QConsultaModule { }
