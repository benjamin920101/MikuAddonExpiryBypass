/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiIiiII;
import com.github.mikumiku.addon.iIiIIiiIiI;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiIIi {
    private static Path IiIIIIiiii = null;
    private final String IiiIIIiiIi;
    private final ClassLoader iiIIiiIiii;
    public static final String iIiiIiiiII = "hawtjni.strategy";
    public static final String iIIiiIIIII = "temp";
    private String iiIiIIiIIi;
    public static final String IIIIiIiiIi;
    private final String IiIiIIIIiI;
    private URL iiiiiIIiiI;
    public static final String iiIIIIiIII;
    public static final String IiIIiIiiiI = "sha1";
    private boolean ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, String string, String string2, String string3, String string4) {
        void IiIIiIiiiI222;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        Object object = string2;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        object = new StringBuilder().insert(3 & 4, iIiIIiiIiI.ALLATORIxDEMO("*\u0019\u0013=J\u0015)\u001aH2&\b.\n\u0002s")).append(object == null ? "" : new StringBuilder().insert(3 ^ 3, (String)object).append((char)(0x6F & 0x3F)).toString()).append((String)IiIIiIiiiI222).toString();
        object = IiIIiIiiiI.iiIIiiIiii.getResource((String)object);
        if (object != null) {
            File file;
            Iterator<File> IiIIiIiiiI3;
            void IiIIiIiiiI4;
            int IiIIiIiiiI222 = IiIIiIiiiI4.lastIndexOf(0x7E & 0x2F);
            int n = 3 & 4;
            String IiIIiIiiiI222 = new StringBuilder().insert(n, IiIIiIiiiI4.substring(n, IiIIiIiiiI222)).append(IIiIiIiiII.ALLATORIxDEMO("m")).toString();
            File[] fileArray = new File[--3];
            if (IiIIiIiiiI3 != null) {
                String[] stringArray = new String[2 ^ 3];
                stringArray[3 >> 2] = IiIIiIiiiI3;
                file = IiIIiIiiiI.ALLATORIxDEMO(stringArray);
            } else {
                file = null;
            }
            fileArray[3 & 4] = file;
            int n2 = 3 & 5;
            String[] stringArray = new String[n2];
            stringArray[3 ^ 3] = System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("-\u001d\u0011=I5\br3\u00117\u0018\u000e."));
            fileArray[n2] = IiIIiIiiiI.ALLATORIxDEMO(stringArray);
            String[] stringArray2 = new String[--3];
            stringArray2[3 ^ 3] = System.getProperty(IIiIiIiiII.ALLATORIxDEMO("5\u0016%7N-\u000f\b%"));
            stringArray2[3 & 5] = iIiIIiiIiI.ALLATORIxDEMO("I4&\u000b3\u0016\t5");
            stringArray2[1 ^ 3] = IiIIiIiiiI.IiIiIIIIiI;
            fileArray[--2] = IiIIiIiiiI.ALLATORIxDEMO(stringArray2);
            for (File file2 : Arrays.asList(fileArray)) {
                File file3;
                void IiIIiIiiiI5;
                if (file2 == null) continue;
                IIiIiiiIIi iIiIiiiIIi3 = IiIIiIiiiI;
                if ((IiIIiIiiiI.equals(IIIIiIiiIi) ? iIiIiiiIIi3.ALLATORIxDEMO((ArrayList<Throwable>)IiIIiIiiiI5, (URL)object, IiIIiIiiiI222, (String)IiIIiIiiiI4, file2) : iIiIiiiIIi3.IiiiiiiIIi((ArrayList<Throwable>)IiIIiIiiiI5, (URL)object, IiIIiIiiiI222, (String)IiIIiIiiiI4, file2)) == null || !IiIIiIiiiI.ALLATORIxDEMO((ArrayList<Throwable>)IiIIiIiiiI5, file3)) continue;
                IiIIiIiiiI.iiiiiIIiiI = object;
                return (4 ^ 5) != 0;
            }
        }
        return false;
    }

    @Deprecated
    public final String IiiIiIiIiI() {
        return this.iIIiiiIiiI();
    }

    @Deprecated
    public final String IiiIIIIiiI(String string) {
        IIiIiiiIIi iIiIiiiIIi2 = string2;
        String string2 = string;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        return IiIIiIiiiI.IiiiiiiIIi(string2);
    }

    static {
        iiIIIIiIII = System.getProperty(IIiIiIiiII.ALLATORIxDEMO("#\t\t%K3\u00000$\u0012$\u0014\n2"));
        IIIIiIiiIi = System.getProperty(iIiiIiiiII, iIiIIiiIiI.ALLATORIxDEMO("+.\u0012#\u0013\u0010/").equals(IIiIiiiIIi.IiIiiiIIiI()) ? IiIIiIiiiI : iIIiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiIIi(String string, Class<?> clazz) {
        void IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = clazz2;
        Class<?> clazz2 = clazz;
        IIiIiiiIIi IiIIiIiiiI2 = iIiIiiiIIi2;
        IiIIiIiiiI2((String)IiIIiIiiiI, IIiIiiiIIi.ALLATORIxDEMO(clazz2), clazz2.getClassLoader());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez4\u0019g\t\u00178&\b\u0002}G\u8bab\u6693\u65ec\u5277\u677c\u65f7\u7234\u674b\uff5d"));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ File IiiiiiiIIi(ArrayList<Throwable> arrayList, URL uRL, String string, String string2, File file) {
        void IiIIiIiiiI;
        FileOutputStream IiIIiIiiiI22;
        void IiIIiIiiiI3;
        File IiIIiIiiiI4;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        File file2 = null;
        if (!(IiIIiIiiiI4 = IiIIiIiiiI4.getAbsoluteFile()).exists() && !IiIIiIiiiI4.mkdirs()) {
            IiIIiIiiiI3.add(new IOException(new StringBuilder().insert(3 ^ 3, iIiIIiiIiI.ALLATORIxDEMO("??\u00008\f>\u0000o(\\$\u000e\u0002=3\u0019G8\u000e.\u0002?3\u00135\u0005]|")).append(IiIIiIiiiI4).toString()));
            return null;
        }
        if (IiIIIIiiii == null) {
            IiIIIIiiii = Files.createTempDirectory(IiIIiIiiiI4.toPath(), IiIIiIiiiI22, new FileAttribute[3 ^ 3]);
        }
        IiIIiIiiiI22 = null;
        Object object = null;
        try {
            Object IiIIiIiiiI5;
            String[] stringArray = new String[3 & 5];
            stringArray[3 >> 2] = IiIIiIiiiI5;
            file2 = Files.createFile(Paths.get(IiIIIIiiii.toString(), stringArray), new FileAttribute[3 & 4]).toFile();
            object = IiIIiIiiiI.openStream();
            if (object != null) {
                IiIIiIiiiI5 = new byte[0x32D2 & 0x5D2D];
                IiIIiIiiiI22 = new FileOutputStream(file2);
                Object object2 = object;
                while (true) {
                    int n = ((InputStream)object2).read((byte[])IiIIiIiiiI5);
                    if (n == -4 >> 2) break;
                    object2 = object;
                    IiIIiIiiiI22.write((byte[])IiIIiIiiiI5, 3 & 4, n);
                }
                iIiIiiiIIi2.ALLATORIxDEMO(file2);
            }
            File file3 = file2;
            file3.deleteOnExit();
            IiIIiIiiiI5 = file3;
        } catch (Throwable IiIIiIiiiI5) {
            try {
                IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI22);
                IIiIiiiIIi.ALLATORIxDEMO((Closeable)object);
                throw IiIIiIiiiI5;
            } catch (Throwable IiIIiIiiiI22) {
                Object object3;
                if (file2 != null) {
                    file2.delete();
                    object = new IOException(new StringBuilder().insert(3 >> 2, IIiIiIiiII.ALLATORIxDEMO("\u001d\u0006,\n!\u0006f\u0016(\u0002b=\u00147\u0001\u00064e\f\f\"\u0017!\u00179e\u00067\u000f\b`")).append(IiIIiIiiiI).append(iIiIIiiIiI.ALLATORIxDEMO("g\b\b|")).append(file2).toString());
                    object3 = object;
                } else {
                    object3 = object = new IOException(new StringBuilder().insert(3 & 4, IIiIiIiiII.ALLATORIxDEMO("\tLf\u000f$\rm\u001c\"C%\u0010\"Cs @1\u0005\b0*\u0012\u00042\u001c`\u0003))\u0005e\t\u000b`")).append(IiIIiIiiiI4).toString());
                }
                ((Throwable)object3).initCause(IiIIiIiiiI22);
                IiIIiIiiiI3.add(object);
                return null;
            }
        }
        IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI22);
        IIiIiiiIIi.ALLATORIxDEMO((Closeable)object);
        return IiIIiIiiiI5;
    }

    public final String iIIIiIIIii() {
        IIiIiiiIIi iIiIiiiIIi2 = this;
        return iIiIiiiIIi2.ALLATORIxDEMO(iIiIiiiIIi2.IiIiIIIIiI);
    }

    public IIiIiiiIIi(String string) {
        IIiIiiiIIi iIiIiiiIIi2 = string2;
        String string2 = string;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        IiIIiIiiiI(string2, null, null);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiII.ALLATORIxDEMO("2+Gf6\u0005e\u0015\u0015$$\u0014\u0000aE\u8bb7\u6691\u65f0\u5275\u6760\u65f5\u7228\u6749\uff41"));
        }
    }

    public final String IiiiiiiIIi(String string) {
        IIiIiiiIIi IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = string2;
        String string2 = string;
        IIiIiiiIIi iIiIiiiIIi3 = IiIIiIiiiI = iIiIiiiIIi2;
        return new StringBuilder().insert(3 ^ 3, iIiIIiiIiI.ALLATORIxDEMO("*\u0019\u0013=J\u0015)\u001aH2&\b.\n\u0002s")).append(string2).append(IIiIiIiiII.ALLATORIxDEMO("o")).append(iIiIiiiIIi3.ALLATORIxDEMO(iIiIiiiIIi3.IiIiIIIIiI)).toString();
    }

    @Deprecated
    public final String iIiiIIiiIi() {
        return this.iIIiIIiIii();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(File file) {
        void IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = classLoader;
        if (IIiIiiiIIi.ALLATORIxDEMO().startsWith(iIiIIiiIiI.ALLATORIxDEMO("+.\u0012#\u0013\u0010/"))) {
            return;
        }
        try {
            ClassLoader classLoader = iIiIiiiIIi2.getClass().getClassLoader();
            Class[] classArray = new Class[5 >> 2];
            classArray[3 >> 2] = String.class;
            Object[] objectArray = new Object[3 >> 1];
            objectArray[5 >> 3] = IIiIiIiiII.ALLATORIxDEMO("2\u001287M=\u0012H8");
            Object object = classLoader.loadClass(IIiIiIiiII.ALLATORIxDEMO("\u0013=\u0017%K.\u000e-W:Kk\bf\t9\u001c?\n$\u00173G)\u0015\u000f6\t\u001d\u0006,\f\u0000\u0010\u00002\b)6\u0013,\u000f\u000b3")).getMethod(iIiIIiiIiI.ALLATORIxDEMO("\u0001.\b1\u0014\b5\u0015\t;"), classArray).invoke(null, objectArray);
            Object object2 = IiIIiIiiiI.getClass().getMethod(iIiIIiiIiI.ALLATORIxDEMO("3\u0013\u0017\u001d\u00134"), new Class[3 >> 2]).invoke((Object)IiIIiIiiiI, new Object[2 & 5]);
            Object object3 = classLoader;
            Class<?> clazz = ((ClassLoader)object3).loadClass(IIiIiIiiII.ALLATORIxDEMO("/\u0001\u0013!k\u000e\f/K&\f, N\u0015\u0001\u0011("));
            Class[] classArray2 = new Class[1 ^ 3];
            classArray2[3 >> 2] = clazz;
            classArray2[--1] = Set.class;
            Object[] objectArray2 = new Object[--2];
            objectArray2[3 ^ 3] = object2;
            objectArray2[--1] = object;
            ((ClassLoader)object3).loadClass(iIiIIiiIiI.ALLATORIxDEMO("\u0016&\n\u0006r)\u0015\br\u00015\u000b9i:.\u0010\u0002/")).getMethod(IIiIiIiiII.ALLATORIxDEMO("4Gs\u0015\u000f6\t\u001d\u0006,\f\u0000\u0010\u00002\b)6\u0013,\u000f\u000b3"), classArray2).invoke(null, objectArray2);
            return;
        } catch (Throwable throwable) {
            try {
                String[] stringArray = new String[--3];
                stringArray[2 & 5] = iIiIIiiIiI.ALLATORIxDEMO("\u001f/\u0011\b8");
                stringArray[5 >> 2] = IIiIiIiiII.ALLATORIxDEMO("WPu");
                stringArray[--2] = IiIIiIiiiI.getCanonicalPath();
                Runtime.getRuntime().exec(stringArray).waitFor();
                return;
            } catch (Throwable throwable2) {
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, String string) {
        boolean bl;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        Object object = string;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        try {
            System.loadLibrary((String)object);
            IIiIiiiIIi iIiIiiiIIi3 = IiIIiIiiiI;
            iIiIiiiIIi3.iiIiIIiIIi = IIiIiIiiII.ALLATORIxDEMO("6\u00002\u0004n\u000b+\u001b.Cu\u0014f\u0018,\u001c%O5\u0017)\fe*\u000f1N\t)'\u0012\u00042\u001cn\u0015!1\b)\t\u0007z") + (String)object;
            bl = true;
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            void IiIIiIiiiI2;
            object = new LinkageError(new StringBuilder().insert(2 & 5, iIiIIiiIiI.ALLATORIxDEMO("\u000eNz%\u0010\"\\\u00133g\u0010\b=\u0003|\u000b5%\u000e&\u000e\u001e|")).append((String)object).toString());
            ((Throwable)object).initCause(unsatisfiedLinkError);
            IiIIiIiiiI2.add(object);
            return (3 & 4) != 0;
        }
        return bl;
    }

    @Deprecated
    public final String IIIIIIiIii() {
        return this.IiiiiiiiII();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        void IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        try {
            int n;
            Object object = MessageDigest.getInstance(IIiIiIiiII.ALLATORIxDEMO("\u0016($q"));
            byte[] byArray = new byte[0x7849 & 0x17B6];
            void v0 = IiIIiIiiiI;
            while (true) {
                int n2 = v0.read(byArray);
                if (n2 == -4 >> 2) break;
                v0 = IiIIiIiiiI;
                ((MessageDigest)object).update(byArray, 3 >> 2, n2);
            }
            object = ((MessageDigest)object).digest();
            StringBuilder stringBuilder = new StringBuilder();
            int n3 = ((Object)object).length;
            int n4 = n = 3 >> 2;
            while (n4 < n3) {
                String string = Integer.toString((object[n] & (0x42FF & 0x3DFF)) + (0x3323 & 0x4DDC), 0x37 & 0x58);
                stringBuilder.append(string.substring(3 >> 1));
                n4 = ++n;
            }
            String string = stringBuilder.toString();
            return string;
        } finally {
            IIiIiiiIIi.ALLATORIxDEMO((Closeable)IiIIiIiiiI);
        }
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiIIi(String string, String string2, ClassLoader classLoader) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiIiiiIIi iIiIiiiIIi2 = string3;
        String string3 = string;
        IIiIiiiIIi IiIIiIiiiI3 = iIiIiiiIIi2;
        if (string3 == null) {
            throw new IllegalArgumentException(iIiIIiiIiI.ALLATORIxDEMO("\u0012&\u0011\u0002|$\u001d\t2\b(G>\"\\)\t\u000b0"));
        }
        IIiIiiiIIi iIiIiiiIIi3 = IiIIiIiiiI3;
        iIiIiiiIIi3.IiIiIIIIiI = string3;
        iIiIiiiIIi3.IiiIIIiiIi = IiIIiIiiiI2;
        IiIIiIiiiI3.iiIIiiIiii = IiIIiIiiiI;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiII.ALLATORIxDEMO("2+Gf6\u0005e\u0015\u0015$$\u0014\u0000aE\u8bb7\u6691\u65f0\u5275\u6760\u65f5\u7228\u6749\uff41"));
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO(Closeable IiIIiIiiiI) {
        if (IiIIiIiiiI != null) {
            try {
                IiIIiIiiiI.close();
                return;
            } catch (Exception exception) {}
        }
    }

    public final String iIIiIIiIii() {
        return this.IiiiiiiIIi(IIiIiiiIIi.ALLATORIxDEMO());
    }

    public static int ALLATORIxDEMO() {
        String string = System.getProperty(IIiIiIiiII.ALLATORIxDEMO("\u00130\u000eK!7\u0003\rn\u0001!\u0011!k\r*\u0004\u0000,"));
        if (string == null) {
            string = System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("$\u0013\nr.\u001e\nr\u00111I>.\b*\u0013\u00039"));
        }
        if (string != null) {
            return Integer.parseInt(string);
        }
        if (System.getProperty(IIiIiIiiII.ALLATORIxDEMO("/6N$\u0012\u0006(")).endsWith(iIiIIiiIiI.ALLATORIxDEMO("Qh")) && IIiIiIiiII.ALLATORIxDEMO("65\u00073\u00112$\u0014 @3\r").equals(System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("\r=\u0011=I**R)\u001d\n9")))) {
            return 0x7A & 0x45;
        }
        return 64;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ File ALLATORIxDEMO(ArrayList<Throwable> arrayList, URL uRL, String string, String string2, File file) {
        Object object;
        InputStream IiIIiIiiiI;
        FileOutputStream IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        File IiIIiIiiiI5;
        IIiIiiiIIi iIiIiiiIIi2 = object2;
        Object object2 = null;
        if (!(IiIIiIiiiI5 = IiIIiIiiiI5.getAbsoluteFile()).exists() && !IiIIiIiiiI5.mkdirs()) {
            IiIIiIiiiI4.add(new IOException(new StringBuilder().insert(3 ^ 3, IIiIiIiiII.ALLATORIxDEMO("=#\u0002$\u000e\"\u0002s*@&\u0012\u0000!1\u0005E$\f2\u0000#1\u000f7\u0019_`")).append(IiIIiIiiiI5).toString()));
            return null;
        }
        String string3 = iIiIiiiIIi2.ALLATORIxDEMO(IiIIiIiiiI3.openStream());
        Object object3 = "";
        object2 = new File(IiIIiIiiiI5, (String)((Object)IiIIiIiiiI2) + string3 + (String)((Object)IiIIiIiiiI));
        if (((File)object2).isFile() && ((File)object2).canRead()) {
            object3 = iIiIiiiIIi2.ALLATORIxDEMO(new FileInputStream((File)object2));
        }
        if (((String)object3).equals(string3)) {
            return object2;
        }
        IiIIiIiiiI2 = null;
        IiIIiIiiiI = null;
        try {
            IiIIiIiiiI = IiIIiIiiiI3.openStream();
            if (IiIIiIiiiI != null) {
                object = new byte[0x3465 & 0x5B9A];
                IiIIiIiiiI2 = new FileOutputStream((File)object2);
                InputStream inputStream = IiIIiIiiiI;
                while (true) {
                    int n = inputStream.read((byte[])object);
                    if (n == -4 >> 2) break;
                    inputStream = IiIIiIiiiI;
                    IiIIiIiiiI2.write((byte[])object, 3 >> 2, n);
                }
                iIiIiiiIIi2.ALLATORIxDEMO((File)object2);
            }
            object = object2;
        } catch (Throwable throwable) {
            try {
                IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI2);
                IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI);
                throw throwable;
            } catch (Throwable throwable2) {
                Object object4;
                if (object2 != null) {
                    ((File)object2).delete();
                    object3 = new IOException(new StringBuilder().insert(3 >> 2, iIiIIiiIiI.ALLATORIxDEMO("\u0001\u00040\b=\u0004z\u00144\u0000~?\b5\u001d\u0004(g\u0010\u000e>\u0015=\u0015%g\u001a5\u0013\n|")).append(IiIIiIiiiI3).append(IIiIiIiiII.ALLATORIxDEMO("e\u0014\n`")).append(object2).toString());
                    object4 = object3;
                } else {
                    object4 = object3 = new IOException(new StringBuilder().insert(3 & 4, iIiIIiiIiI.ALLATORIxDEMO("\u0015Nz\r8\u000fq\u001e>A9\u0012>Ao\"\\3\u0019\n,(\u000e\u0006.\u001e|\u00015+\u0019g\u0015\t|")).append(IiIIiIiiiI5).toString());
                }
                ((Throwable)object4).initCause(throwable2);
                IiIIiIiiiI4.add(object3);
                return null;
            }
        }
        IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI2);
        IIiIiiiIIi.ALLATORIxDEMO(IiIIiIiiiI);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, File file) {
        boolean bl;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        Object object = file;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        try {
            System.load(((File)object).getPath());
            IiIIiIiiiI.iiIiIIiIIi = ((File)object).getPath();
            bl = true;
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            void IiIIiIiiiI2;
            object = new LinkageError(new StringBuilder().insert(3 >> 2, iIiIIiiIiI.ALLATORIxDEMO("??\u00008\f>\u0000o(\\+\u0013\u00068g\u0010\u000e>\u0015=\u0015%g\u001a5\u0013\n|")).append(object).toString());
            ((Throwable)object).initCause(unsatisfiedLinkError);
            IiIIiIiiiI2.add(object);
            return 5 >> 3;
        }
        return bl;
    }

    public static String IiIiiiIIiI() {
        String string = System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("34R)\u001d\n9")).toLowerCase().trim();
        if (string.startsWith(IIiIiIiiII.ALLATORIxDEMO("\f,\u000e\u00108"))) {
            return iIiIIiiIiI.ALLATORIxDEMO("\u0010.\u0012\u0012$");
        }
        if (string.startsWith(IIiIiIiiII.ALLATORIxDEMO("\b!&@*\u0013E8"))) {
            return iIiIIiiIiI.ALLATORIxDEMO("\u0013\u0014$");
        }
        if (string.startsWith(IIiIiIiiII.ALLATORIxDEMO("\u0017\f."))) {
            return iIiIIiiIiI.ALLATORIxDEMO("+.\u0012#\u0013\u0010/");
        }
        return string.replaceAll(IIiIiIiiII.ALLATORIxDEMO("<2k"), iIiIIiiIiI.ALLATORIxDEMO("\u0003"));
    }

    public synchronized void IiiiiiiIIi() {
        if (this.ALLATORIxDEMO) {
            return;
        }
        this.ALLATORIxDEMO();
        this.ALLATORIxDEMO = 3 >> 1;
    }

    public final String IiiiiiiiII() {
        IIiIiiiIIi iIiIiiiIIi2 = this;
        return new StringBuilder().insert(3 >> 2, iIiIIiiIiI.ALLATORIxDEMO("*\u0019\u0013=J\u0015)\u001aH2&\b.\n\u0002s")).append(iIiIiiiIIi2.ALLATORIxDEMO(iIiIiiiIIi2.IiIiIIIIiI)).toString();
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        IIiIiiiIIi iIiIiiiIIi2 = object;
        Object object = string;
        IIiIiiiIIi IiIIiIiiiI = iIiIiiiIIi2;
        object = System.mapLibraryName((String)object);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiIIi(String string, String string2) {
        void IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = string3;
        String string3 = string2;
        IIiIiiiIIi IiIIiIiiiI2 = iIiIiiiIIi2;
        IiIIiIiiiI2((String)IiIIiIiiiI, string3, null);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiII.ALLATORIxDEMO("2+Gf6\u0005e\u0015\u0015$$\u0014\u0000aE\u8bb7\u6691\u65f0\u5275\u6760\u65f5\u7228\u6749\uff41"));
        }
    }

    public final String iIIiiiIiiI() {
        IIiIiiiIIi iIiIiiiIIi2 = this;
        return new StringBuilder().insert(3 >> 2, iIiIIiiIiI.ALLATORIxDEMO("*\u0019\u0013=J\u0015)\u001aH2&\b.\n\u0002s")).append(IIiIiiiIIi.ALLATORIxDEMO()).append(IIiIiIiiII.ALLATORIxDEMO("o")).append(System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("34R&\u000e\u00044"))).append(IIiIiIiiII.ALLATORIxDEMO("o")).append(iIiIiiiIIi2.ALLATORIxDEMO(iIiIiiiIIi2.IiIiIIIIiI)).toString();
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        Object object;
        IIiIiiiIIi iIiIiiiIIi2 = object2;
        Object object2 = System.getProperty(new StringBuilder().insert(2 & 5, IIiIiIiiII.ALLATORIxDEMO("\t)'\u0012$\u0012\u001cn")).append(iIiIiiiIIi2.IiIiIIIIiI).append(iIiIIiiIiI.ALLATORIxDEMO("I*\"\u000e4\u0015\b2")).toString());
        if (object2 == null) {
            object2 = iIiIiiiIIi2.IiiIIIiiIi;
        }
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        IIiIiiiIIi iIiIiiiIIi3 = iIiIiiiIIi2;
        Object object3 = iIiIiiiIIi3.ALLATORIxDEMO();
        String string = iIiIiiiIIi3.ALLATORIxDEMO(iIiIiiiIIi3.IiIiIIIIiI);
        String string2 = object2 == null ? null : iIiIiiiIIi2.ALLATORIxDEMO(new StringBuilder().insert(2 & 5, iIiIiiiIIi2.IiIiIIIIiI).append(IIiIiIiiII.ALLATORIxDEMO("m")).append((String)object2).toString());
        String string3 = System.getProperty(new StringBuilder().insert(3 & 4, iIiIIiiIiI.ALLATORIxDEMO("\u000b5%\u000e&\u000e\u001er")).append(iIiIiiiIIi2.IiIiIIIIiI).append(IIiIiIiiII.ALLATORIxDEMO("N5\u0001\u0011(")).toString());
        if (string3 != null) {
            object = object3;
            int n2 = ((String[])object3).length;
            int n3 = n = 5 >> 3;
            while (n3 < n2) {
                String string4 = object[n];
                if (object2 != null) {
                    IIiIiiiIIi iIiIiiiIIi4 = iIiIiiiIIi2;
                    String[] stringArray = new String[--3];
                    stringArray[2 & 5] = string3;
                    stringArray[2 ^ 3] = string4;
                    stringArray[1 ^ 3] = string2;
                    if (iIiIiiiIIi4.ALLATORIxDEMO(arrayList, iIiIiiiIIi4.ALLATORIxDEMO(stringArray))) {
                        return;
                    }
                }
                String[] stringArray = new String[--3];
                stringArray[5 >> 3] = string3;
                stringArray[5 >> 2] = string4;
                stringArray[--2] = string;
                if (iIiIiiiIIi2.ALLATORIxDEMO(arrayList, iIiIiiiIIi2.ALLATORIxDEMO(stringArray))) {
                    return;
                }
                n3 = ++n;
            }
        }
        if (object2 != null) {
            IIiIiiiIIi iIiIiiiIIi5 = iIiIiiiIIi2;
            if (iIiIiiiIIi5.ALLATORIxDEMO(arrayList, iIiIiiiIIi5.IiIiIIIIiI + IIiIiiiIIi.ALLATORIxDEMO() + iIiIIiiIiI.ALLATORIxDEMO("q") + (String)object2)) {
                return;
            }
        }
        if (object2 != null) {
            IIiIiiiIIi iIiIiiiIIi6 = iIiIiiiIIi2;
            if (iIiIiiiIIi6.ALLATORIxDEMO(arrayList, iIiIiiiIIi6.IiIiIIIIiI + IIiIiIiiII.ALLATORIxDEMO("m") + (String)object2)) {
                return;
            }
        }
        if (iIiIiiiIIi2.ALLATORIxDEMO(arrayList, iIiIiiiIIi2.IiIiIIIIiI)) {
            return;
        }
        if (iIiIiiiIIi2.iiIIiiIiii != null) {
            int n4;
            object = object2 != null ? string2 : string;
            String[] stringArray = object3;
            n = ((String[])object3).length;
            int n5 = n4 = 5 >> 3;
            while (n5 < n) {
                object3 = stringArray[n4];
                if (object2 != null && iIiIiiiIIi2.ALLATORIxDEMO(arrayList, string3, (String)object3, string2, (String)object)) {
                    return;
                }
                if (iIiIiiiIIi2.ALLATORIxDEMO(arrayList, string3, (String)object3, string, (String)object)) {
                    return;
                }
                n5 = ++n4;
            }
        }
        object = new UnsatisfiedLinkError(new StringBuilder().insert(3 >> 2, iIiIIiiIiI.ALLATORIxDEMO("X\u0000!\u00065J?\u000e.@7Oz#\\+\u0015\u0005.&\u000e\u001erG\u000e\u0002=4\u0013)\u000f]|")).append(arrayList.toString()).toString());
        try {
            Class[] classArray = new Class[4 ^ 5];
            classArray[3 & 4] = Throwable.class;
            Method method = Throwable.class.getMethod(IIiIiIiiII.ALLATORIxDEMO("\u0001\u0001$65\u001507\u00056\u0013\u0000$"), classArray);
            for (Throwable throwable : arrayList) {
                Object[] objectArray = new Object[--1];
                objectArray[5 >> 3] = throwable;
                method.invoke(object, objectArray);
            }
        } catch (Throwable throwable) {
            // empty catch block
        }
        throw object;
    }

    @Deprecated
    public final String iiIiiiiiII() {
        return this.IiiiiiiIIi();
    }

    public URL ALLATORIxDEMO() {
        return this.iiiiiIIiiI;
    }

    public String IiiIIIIiiI() {
        return this.iiIiIIiIIi;
    }

    public final String IiiiiiiIIi() {
        return this.IiiiiiiIIi(IIiIiiiIIi.IiIiiiIIiI());
    }

    private static /* synthetic */ String ALLATORIxDEMO(Class<?> IiIIiIiiiI) {
        try {
            return IiIIiIiiiI.getPackage().getImplementationVersion();
        } catch (Throwable throwable) {
            return null;
        }
    }

    public final String[] ALLATORIxDEMO() {
        String[] stringArray = new String[--4];
        int n = 2 & 5;
        stringArray[n] = new StringBuilder().insert(n, IIiIiiiIIi.ALLATORIxDEMO()).append(IIiIiIiiII.ALLATORIxDEMO("o")).append(System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("34R&\u000e\u00044"))).toString();
        stringArray[--1] = IIiIiiiIIi.ALLATORIxDEMO();
        stringArray[1 ^ 3] = IIiIiiiIIi.IiIiiiIIiI();
        stringArray[--3] = IIiIiIiiII.ALLATORIxDEMO("n");
        return stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ File ALLATORIxDEMO(String ... stringArray) {
        int n;
        void IiIIiIiiiI;
        IIiIiiiIIi iIiIiiiIIi2 = object;
        Object object = null;
        int n2 = ((void)IiIIiIiiiI).length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            void var3_5 = IiIIiIiiiI[n];
            if (object == null) {
                object = new File((String)var3_5);
            } else if (var3_5 != null) {
                object = new File((File)object, (String)var3_5);
            }
            n3 = ++n;
        }
        return object;
    }

    public static String ALLATORIxDEMO() {
        return new StringBuilder().insert(3 >> 2, IIiIiiiIIi.IiIiiiIIiI()).append(IIiIiiiIIi.ALLATORIxDEMO()).toString();
    }
}

