import { Injectable } from '@angular/core';
import {HttpHelperService} from '../httpHelper/http-helper.service';
import { HttpParams } from '@angular/common/http';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ConsultarService {
  private BASE_URL: string = "http://localhost:8080";
  private CONSULTAR_DOCENTES: string = this.BASE_URL + '/obtenerDocentes';
  private CONSULTAR_ESTUDIANTES: string = this.BASE_URL + '/consultarAsignaturas';

  constructor(private httpHelperService: HttpHelperService,
    private http: HttpClient) { }


  getProfesores(): Observable<any[]>{
    return this.getServiceObservableParams(this.CONSULTAR_DOCENTES, null);
  }

  getEstudiantes(nombre: string): Promise<[any]> {
    return new Promise((resolve, reject) => {
      const params = new HttpParams()
        .set('nombre', nombre);
      this.httpHelperService.getRequest(
        this.CONSULTAR_ESTUDIANTES,
        resolve,
        reject,
        params
      );
    });
  }

  getAsignaturas(idProfe: number): Observable<any[]>{
    const params  = new HttpParams()
    .set('idProfesor', idProfe.toString());
    return this.getServiceObservableParams(this.CONSULTAR_ESTUDIANTES, params);
  }

  getServiceObservableParams(url: string, params: HttpParams): Observable<any> {
    const httpOptions = { params: params };
    return this.http.get(url, httpOptions);
  }
}
