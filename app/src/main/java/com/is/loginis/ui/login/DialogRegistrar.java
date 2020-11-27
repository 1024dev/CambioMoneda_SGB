package com.is.loginis.ui.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.is.loginis.R;

public class DialogRegistrar extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        EditText textNombreRegistrar;
        EditText editTextTextPassword;
        EditText editTextTextEmailAddress;
        Spinner spnPaisRegistrar;

        AlertDialog.Builder builder =  new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_registrar_usuario,null);

        builder.setView(view)
                .setTitle("Registrar")
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        textNombreRegistrar = view.findViewById(R.id.textNombreRegistrar);
        editTextTextPassword= view.findViewById(R.id.editTextTextPasswordRegistrar);
        editTextTextEmailAddress= view.findViewById(R.id.editTextTextEmailAddressRegistrar);
        spnPaisRegistrar= view.findViewById(R.id.spnPaisRegistrar);

        return builder.create();
    }






}
