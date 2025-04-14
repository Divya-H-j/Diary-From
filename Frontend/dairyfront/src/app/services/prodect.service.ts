
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodect } from '../models/prodect';

@Injectable({
  providedIn: 'root'
})
 export class ProdectService {
 
  private baseUrl = 'http://localhost:9090/prodect/prodects';

  constructor(private http: HttpClient) { }
 

  createProdect(prodect:FormData): Observable<Object> {
   
    return this.http.post(`${this.baseUrl}`, prodect);
  }
  getAll() {
   
    return this.http.get<Prodect[]>(`${this.baseUrl}`);
  }
  deleteprodect(prodectid:number){
   
    return this.http.delete(`${this.baseUrl}`+"/"+prodectid)
  }
}
