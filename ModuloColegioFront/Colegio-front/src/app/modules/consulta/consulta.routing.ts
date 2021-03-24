import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConsultaColegioComponent } from '../../components/consulta-colegio/consulta-colegio.component';

const routes: Routes = [
  { path: '', component: ConsultaColegioComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ConsultaRoutingModule { }
