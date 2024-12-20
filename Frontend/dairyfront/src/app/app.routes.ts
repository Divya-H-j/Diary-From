import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProdectComponent } from './prodect/prodect.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'Prodect',component:ProdectComponent},
    
];
