import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { BloodTestComponent } from './components/blood-test/blood-test.component';
import { ComorbidityComponent } from './components/comorbidity/comorbidity.component';
import { MedicalHistoryComponent } from './components/medical-history/medical-history.component';
import { UserComponent } from './components/user/user.component';
import { XrayComponent } from './components/xray/xray.component';

@NgModule({
  declarations: [
    AppComponent,
    BloodTestComponent,
    ComorbidityComponent,
    MedicalHistoryComponent,
    UserComponent,
    XrayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
