import { Component, OnInit, Input} from '@angular/core';
import { consultaAsignaturas } from '../../../utils/const/consultaAsignaturas';

@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.scss']
})
export class TablaComponent implements OnInit {

  @Input('inputData') dataSource: consultaAsignaturas[];

  columnasMostradas: string[] = ['idcurso', 'nombreCusro', 'idEstudiante', 'nombreEstudiante', 'idAsignatura', 'nombreAsignatura', 'idProfe', 'nombreProfe'];

  constructor() { }

  ngOnInit(): void {
  }

}
