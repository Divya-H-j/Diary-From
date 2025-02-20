import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProdectComponent } from './prodect/prodect.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { ManageprodectComponent } from './manageprodect/manageprodect.component';
import { ContactsComponent } from './contacts/contacts.component';
import { AboutComponent } from './about/about.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'Prodect',component:ProdectComponent},
    {path:'register',component:RegisterComponent},
    {path:'login',component:LoginComponent},
    {path:'adminlogin',component:AdminLoginComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'vfeedback',component:ViewfeedbackComponent},
    {path:'vreg',component:ViewRegisterComponent},
    {path:'mprodect',component:ManageprodectComponent},
    {path:'contacts',component:ContactsComponent},
    {path:'about',component:AboutComponent},
    
];
