package rs.aleph.android.example12.activities;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.security.Provider;
import java.util.List;

import rs.aleph.android.example12.R;


// Each fragment extends Fragment class
public class DetailFragment extends Fragment {

    // Position of the item to be displayed in the detail fragment
    private int position = 0;

    // onCreate method is a life-cycle method that is called when creating the fragment.
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT).show();
    }

    // onActivityCreated method is a life-cycle method that is called when the fragment's activity has been created and this fragment's view hierarchy instantiated.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvajder.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tvName" TextView and sets "text" property
        TextView tvIme = (TextView) getView().findViewById(R.id.tv_ime);
        tvIme.setText(JeloProvajder.getJeloById(position).getIme());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvOpis = (TextView) getView().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvajder.getJeloById(position).getOpis());

        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> categories = KategorijamaProvajder.getKategorijamaNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)JeloProvajder.getJeloById(position).getKategorijama().getId());



        TextView tvSastojci = (TextView) getView().findViewById(R.id.tv_sastojci);
        tvSastojci.setText(JeloProvajder.getJeloById(position).getSastojci());
        // Finds "btnBuy" Button and sets "onClickListener" listener


    }

    // onSaveInstanceState method is a life-cycle method that is called to ask the fragment to save its current dynamic state, so it can later be reconstructed in a new instance of its process is restarted.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }

    // onCreateView method is a life-cycle method that is called  to have the fragment instantiate its user interface view.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        // Finds view in the view hierarchy and returns it.
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    // Called to set fragment's content.
    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    // Called to update fragment's content.
    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);


        // Finds "ivImage" ImageView and sets "imageDrawable" property

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvajder.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Finds "tvName" TextView and sets "text" property
        TextView tvIme = (TextView) getView().findViewById(R.id.tv_ime);
        tvIme.setText(JeloProvajder.getJeloById(position).getIme());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvOpis = (TextView) getView().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvajder.getJeloById(position).getOpis());

        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> categories = KategorijamaProvajder.getKategorijamaNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)JeloProvajder.getJeloById(position).getKategorijama().getId());




        TextView tvSastojci = (TextView) getView().findViewById(R.id.tv_sastojci);
        tvSastojci.setText(JeloProvajder.getJeloById(position).getSastojci());
        // Finds "btnBuy" Button and sets "onClickListener" listener




    }
}
