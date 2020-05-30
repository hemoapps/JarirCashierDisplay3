package jarircashierdisplay.hemo7f12;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    private ImageView imageView;
    private View main;
    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd / MMMM M / yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //حذف شريط التنبيهات
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        main = findViewById(R.id.main);
        imageView = findViewById(R.id.imageview);
        EditText date = findViewById(R.id.date);
        date.setText(dateFormat.format(new Date()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {

            } else {
                if (shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)) {
                    Toast.makeText(MainActivity.this, "Camera permission was not accepted", Toast.LENGTH_SHORT).show();
                }
                requestPermissions(new String[]{Manifest.permission.CAMERA}, 1);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {

            } else {
                if (shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)) {
                    Toast.makeText(MainActivity.this, "Camera permission was not accepted", Toast.LENGTH_SHORT).show();
                }
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }
    }

    public void c1l(View view) {
        img = findViewById(R.id.c1l);
        selectImage();
    }

    public void c1e(View view) {
        img = findViewById(R.id.c1e);
        selectImage();
    }

    public void c1r(View view) {
        img = findViewById(R.id.c1r);
        selectImage();
    }

    public void c2l(View view) {
        img = findViewById(R.id.c2l);
        selectImage();
    }

    public void c2e(View view) {
        img = findViewById(R.id.c2e);
        selectImage();
    }

    public void c2r(View view) {
        img = findViewById(R.id.c2r);
        selectImage();
    }

    public void c3l(View view) {
        img = findViewById(R.id.c3l);
        selectImage();
    }

    public void c3e(View view) {
        img = findViewById(R.id.c3e);
        selectImage();
    }

    public void c3r(View view) {
        img = findViewById(R.id.c3r);
        selectImage();
    }

    public void c4l(View view) {
        img = findViewById(R.id.c4l);
        selectImage();
    }

    public void c4e(View view) {
        img = findViewById(R.id.c4e);
        selectImage();
    }

    public void c4r(View view) {
        img = findViewById(R.id.c4r);
        selectImage();
    }

    public void c5l(View view) {
        img = findViewById(R.id.c5l);
        selectImage();
    }

    public void c5e(View view) {
        img = findViewById(R.id.c5e);
        selectImage();
    }

    public void c5r(View view) {
        img = findViewById(R.id.c5r);
        selectImage();
    }

    public void c6l(View view) {
        img = findViewById(R.id.c6l);
        selectImage();
    }

    public void c6e(View view) {
        img = findViewById(R.id.c6e);
        selectImage();
    }

    public void c6r(View view) {
        img = findViewById(R.id.c6r);
        selectImage();
    }

    public void c7l(View view) {
        img = findViewById(R.id.c7l);
        selectImage();
    }

    public void c7e(View view) {
        img = findViewById(R.id.c7e);
        selectImage();
    }

    public void c7r(View view) {
        img = findViewById(R.id.c7r);
        selectImage();
    }

    public void c8l(View view) {
        img = findViewById(R.id.c8l);
        selectImage();
    }

    public void c8e(View view) {
        img = findViewById(R.id.c8e);
        selectImage();
    }

    public void c8r(View view) {
        img = findViewById(R.id.c8r);
        selectImage();
    }

    public void c9l(View view) {
        img = findViewById(R.id.c9l);
        selectImage();
    }

    public void c9e(View view) {
        img = findViewById(R.id.c9e);
        selectImage();
    }

    public void c9r(View view) {
        img = findViewById(R.id.c9r);
        selectImage();
    }

    public void c10l(View view) {
        img = findViewById(R.id.c10l);
        selectImage();
    }

    public void c10e(View view) {
        img = findViewById(R.id.c10e);
        selectImage();
    }

    public void c10r(View view) {
        img = findViewById(R.id.c10r);
        selectImage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(android.R.menu.class.getModifiers(), menu);
        return true;
    }

    private void selectImage() {
        final CharSequence[] options = {"Preview", "Take Photo", "Choose from Gallery", "Delete", "Cancel"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Add Photo!");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (options[item].equals("Take Photo")) {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                        File f = new File(Environment.getExternalStorageDirectory(), "temp.jpg");
//                        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
                    startActivityForResult(intent, 1);
                } else if (options[item].equals("Choose from Gallery")) {
                    Intent intent = new Intent(Intent.ACTION_PICK);
                    intent.setType("image/*");
                    String[] mimeTypes = {"image/jpeg", "image/png"};
                    intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
                    startActivityForResult(intent, 2);
                } else if (options[item].equals("Preview")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setType("image/*");
                } else if (options[item].equals("Delete")) {
                    img.setImageResource(R.drawable.ct);
                } else if (options[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }//end selectImage


    @SuppressLint("LongLogTag")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                img.setImageBitmap(imageBitmap);

            } else if (requestCode == 2) {
                Uri selectedImage = data.getData();
                img.setImageURI(selectedImage);
            }
        }
    }//end onActivityResult

    public void takescreenshot(View view) {

    }



}


