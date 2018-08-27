# Morpheus

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.0.0.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive/pipe/service/class/module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).




## Production Mode
Because we are using angular cli instead of webpack, the way to specify the env is different. 
I do not fully understand how angular cli handles setting the env, but i have learned this much:

In the folder ui/src/enviroments, there are several files specifying different environments.
You specify the env using this command "ng build  --env=prod", with prod being the extention of the file in the enviroment folder. The resulting code is compiled and put in the dist folder.

However, when you run locally, you run directly from memory, and do not use dist. becuase of this, you automatically get whatever is in the default enviromement file, NOT the one you specified. 


For production builds, the dist folder is used, so by specifying the --env as prod, the prod build is sent to the dist folder.
So the production build will work.

I will figure this out when i get a chance.




