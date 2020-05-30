import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MedicalHistoryComponent} from "./components/medical-history/medical-history.component";
import {ComorbidityComponent} from "./components/comorbidity/comorbidity.component";
import {BloodTestComponent} from "./components/blood-test/blood-test.component";
import {UserComponent} from "./components/user/user.component";
import {XrayComponent} from "./components/xray/xray.component";


const routes: Routes = [
  { path: 'blood-test', component: BloodTestComponent},
  { path: 'comorbidity', component: ComorbidityComponent},
  { path: 'medical-history', component: MedicalHistoryComponent},
  { path: 'user', component: UserComponent},
  { path: 'xray', component: XrayComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
