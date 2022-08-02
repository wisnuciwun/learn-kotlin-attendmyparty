package com.learnkotlin.attendmyparty.Model

import android.os.Parcel
import android.os.Parcelable

class Attender(var dinnerPackage: String, var firstMusic: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()) {}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(dinnerPackage)
        parcel.writeString(firstMusic)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Attender> {
        override fun createFromParcel(parcel: Parcel): Attender {
            return Attender(parcel)
        }

        override fun newArray(size: Int): Array<Attender?> {
            return arrayOfNulls(size)
        }
    }

}
