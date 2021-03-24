import { Component, OnInit } from '@angular/core';
import { consultaAsignaturas } from '../../utils/const/consultaAsignaturas';
import { ConsultarService } from '../../services/consultar/consultar.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-consulta-colegio',
  templateUrl: './consulta-colegio.component.html',
  styleUrls: ['./consulta-colegio.component.scss']
})
export class ConsultaColegioComponent implements OnInit {

  public dataSource: consultaAsignaturas[];
  public listaDocentes: any[];
  public formColegio: FormGroup;

  constructor(private consultarService: ConsultarService, private formBuilder: FormBuilder,) { }

  ngOnInit(): void {
    this.buildForm();
    this.getProfesores();
  }

  /**
   * metodo para iniciar el formulario
   */
  buildForm() {
    this.formColegio = this.formBuilder.group({
      docente: ['', Validators.required],
    });
  }

  /**
   * metodo que invoca al servicio de obtener los docentes
   */
  public getProfesores(): void{
    this.consultarService.getProfesores().subscribe(res => {
      console.log(res);
      this.listaDocentes = res;
    }, err => {
      console.log(err);
    })
  }

  /**
   * metodo que llama al servicio de obtener las asignaturas
   * @param id identificador del docente, se toma del formulario
   */
  public getAsignaturas(id: number): void{
    this.consultarService.getAsignaturas(id).subscribe(res => {
      console.log('res ->', res);
      this.dataSource = res;
    }, err => {
      console.log(err)
    });
  }
  
  /**
   * metodo que se invoca al consultar en el html
   */
  public buscar(): void{
    let profesor = this.formColegio.value.docente;
    console.log(profesor);
    this.getAsignaturas(profesor.id);
  }

}
