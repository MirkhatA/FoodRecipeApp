package com.mirkek.android.foodRecipeApp.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
import javax.inject.Scope

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource
) {

    val remote = remoteDataSource

}