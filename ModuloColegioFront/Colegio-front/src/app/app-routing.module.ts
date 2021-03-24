import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {path: 'consulta',
  loadChildren: () =>
    import('./modules/consulta/consulta.module').then(
      m => m.QConsultaModule
    )},
    { path: '**', redirectTo: '/consulta', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
